package org.cloud.model;
// default package



/**
 * LvbttrsId generated by MyEclipse Persistence Tools
 */

public class LvbttrsId  implements java.io.Serializable {


    // Fields    

     private String tntcod;
     private String trsmgtnum;


    // Constructors

    /** default constructor */
    public LvbttrsId() {
    }

    
    /** full constructor */
    public LvbttrsId(String tntcod, String trsmgtnum) {
        this.tntcod = tntcod;
        this.trsmgtnum = trsmgtnum;
    }

   
    // Property accessors

    public String getTntcod() {
        return this.tntcod;
    }
    
    public void setTntcod(String tntcod) {
        this.tntcod = tntcod;
    }

    public String getTrsmgtnum() {
        return this.trsmgtnum;
    }
    
    public void setTrsmgtnum(String trsmgtnum) {
        this.trsmgtnum = trsmgtnum;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LvbttrsId) ) return false;
		 LvbttrsId castOther = ( LvbttrsId ) other; 
         
		 return ( (this.getTntcod()==castOther.getTntcod()) || ( this.getTntcod()!=null && castOther.getTntcod()!=null && this.getTntcod().equals(castOther.getTntcod()) ) )
 && ( (this.getTrsmgtnum()==castOther.getTrsmgtnum()) || ( this.getTrsmgtnum()!=null && castOther.getTrsmgtnum()!=null && this.getTrsmgtnum().equals(castOther.getTrsmgtnum()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTntcod() == null ? 0 : this.getTntcod().hashCode() );
         result = 37 * result + ( getTrsmgtnum() == null ? 0 : this.getTrsmgtnum().hashCode() );
         return result;
   }   





}