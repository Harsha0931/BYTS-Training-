int largestRectangleArea(int *heights, int heightsz)
{
    int *stack = calloc((heightsz + 1), sizeof(int)), top = 0, off = 0, size = 0, maxsize = 0;
    
    if (!stack) return -1;
    
    stack[0] = -1;    
    
    while (top > 0 || off < heightsz) {
    
        if (!top || (off < heightsz && heights[stack[top]] <= heights[off])) {
            stack[++top] = off++;
        } else if ( off >= heightsz || heights[stack[top]] > heights[off]) {
            size = heights[stack[top]] * (off - stack[top - 1] - 1);
            if (maxsize < size) {
                maxsize = size;
            }
            top--;
        }        
    }
    return maxsize;
}