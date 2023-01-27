class Solution {
    public double[] convertTemperature(double cel) {
        double fr=(cel*1.80)+32.00;double ke=cel+273.15;
        double[] re= new double[2];
        re[0]=ke;
        re[1]=fr;
        return re;
    }
}