public class Time implements Comparable<Time>{
    int h;
    int m;
    int s;
    boolean t;
    Time(int h, int m, int s){
        this.h=h; this.m=m; this.s=s;
    }

    public void add(Time otherTime) {
        this.h += otherTime.h;
        int newMinutes = this.m + otherTime.m;
        int newSeconds = this.s + otherTime.s;

        if (newSeconds >= 60) {
            newMinutes += newSeconds / 60;
            newSeconds %= 60;
        }

        if (newMinutes >= 60) {
            int newHours = newMinutes / 60;
            newMinutes %= 60;
        }
    }
    public String toUniversal() {
        //12:30:47
        String res="";
        res+= (h<10)?"0"+h:h;
        res+=":";
        res+=(m<10)?"0"+m:m;

        return res;



    }
    public String toStandard() {
        StringBuilder r = new StringBuilder();
        if(h>=13&&h<=23) {
            this.t = true;
            if(h-12<10) {
                r.append(0);
            }
            r.append(h-12);
            r.append(':');
        }else if(h>=0&&h<=9) {
            r.append(0);
            r.append(h);
            r.append(':');
        }
        else {
            return "Wrong input";
        }
        if(m>=10&&m<=59) {
            r.append(m);
            r.append(':');
        }else if(m>=0&&m<=9) {
            r.append(0);
            r.append(m);
            r.append(':');
        }
        else {
            return "Wrong input";
        }
        if(s>=10&&s<=59) {
            r.append(s);
            r.append(':');
        }else if(s>=0&&s<=9) {
            r.append(0);
            r.append(s);
        }
        else {
            return "Wrong input";
        }
        if(this.t) {
            r.append(" PM");
        }
        else {
            r.append(" AM");
        }


        return r.toString();

    }

    public String toString() {
        return this.toUniversal();

    }
    public int compareTo(Time other) {
        int thisTotalSeconds = this.h * 3600 + this.m * 60 + this.s;
        int otherTotalSeconds = other.h * 3600 + other.m * 60 + other.s;

        return Integer.compare(thisTotalSeconds, otherTotalSeconds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Time other = (Time) obj;
        return this.compareTo(other) == 0;
    }

}
