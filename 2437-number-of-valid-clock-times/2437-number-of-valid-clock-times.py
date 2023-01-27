class Solution:

    def countTime(self, time: str) -> int:

        hour_val, minute_val = time.split(":")

        h1, h2 = hour_val[0], hour_val[1]

        m1, m2 = minute_val[0], minute_val[1]

        

        if "?" not in time:

            return 1

        

        val1 = 0

        if h1 == "?" and h2 == "?":

            val1 = 24

        elif h1 == "?" and int(h2) <= 3:

            val1 = 3

        elif h1 == "?" and int(h2) > 3:

            val1 = 2

        elif int(h1) <= 1 and h2 == "?":

            val1 = 10

        elif int(h1) > 1 and h2 == "?":

            val1 = 4

            

        if val1 == 0:

            val1 = 1

            

        val2 = 0

        if m1 == "?" and m2 == "?":

            val2 = 60

        elif m1 == "?":

            val2 = 6

        elif m2 == "?":

            val2 = 10

                

        

        if val2 == 0:

            val2 = 1

        

        return val1 * val2
        