
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
    // If compared is earlier
    int minusOneYear = 0;
    if (this.earlier(comparedDate)) {
        if (comparedDate.month < this.month) {
            minusOneYear = 1;
        } else if (comparedDate.month == this.month && comparedDate.day < this.day) {
            minusOneYear = 1;
        }
        return comparedDate.year - this.year - minusOneYear;
    }

    // If this is earlier
    minusOneYear = 0;
    if (this.month < comparedDate.month) {
        minusOneYear = 1;
    } else if(this.month == comparedDate.month && this.day < comparedDate.day) {
        minusOneYear = 1;
    }
    return this.year - comparedDate.year - minusOneYear;
    }

  
}
