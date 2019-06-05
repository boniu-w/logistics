package org.cloud.model;
// default package



/**
 * LvbttrsrefnumId generated by MyEclipse Persistence Tools
 */

public class LvbttrsrefnumId  implements java.io.Serializable {


    // Fields    

     private String tntcod;
     private String trsmgtnum;
     private String trsitmmgtnum;
     private String trsrefmgtnum;


    // Constructors

    /** default constructor */
    public LvbttrsrefnumId() {
    }

    
    /** full constructor */
    public LvbttrsrefnumId(String tntcod, String trsmgtnum, String trsitmmgtnum, String trsrefmgtnum) {
        this.tntcod = tntcod;
        this.trsmgtnum = trsmgtnum;
        this.trsitmmgtnum = trsitmmgtnum;
        this.trsrefmgtnum = trsrefmgtnum;
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

    public String getTrsitmmgtnum() {
        return this.trsitmmgtnum;
    }
    
    public void setTrsitmmgtnum(String trsitmmgtnum) {
        this.trsitmmgtnum = trsitmmgtnum;
    }

    public String getTrsrefmgtnum() {
        return this.trsrefmgtnum;
    }
    
    public void setTrsrefmgtnum(String trsrefmgtnum) {
        this.trsrefmgtnum = trsrefmgtnum;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LvbttrsrefnumId) ) return false;
		 LvbttrsrefnumId castOther = ( LvbttrsrefnumId ) other; 
         
		 return ( (this.getTntcod()==castOther.getTntcod()) || ( this.getTntcod()!=null && castOther.getTntcod()!=null && this.getTntcod().equals(castOther.getTntcod()) ) )
 && ( (this.getTrsmgtnum()==castOther.getTrsmgtnum()) || ( this.getTrsmgtnum()!=null && castOther.getTrsmgtnum()!=null && this.getTrsmgtnum().equals(castOther.getTrsmgtnum()) ) )
 && ( (this.getTrsitmmgtnum()==castOther.getTrsitmmgtnum()) || ( this.getTrsitmmgtnum()!=null && castOther.getTrsitmmgtnum()!=null && this.getTrsitmmgtnum().equals(castOther.getTrsitmmgtnum()) ) )
 && ( (this.getTrsrefmgtnum()==castOther.getTrsrefmgtnum()) || ( this.getTrsrefmgtnum()!=null && castOther.getTrsrefmgtnum()!=null && this.getTrsrefmgtnum().equals(castOther.getTrsrefmgtnum()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTntcod() == null ? 0 : this.getTntcod().hashCode() );
         result = 37 * result + ( getTrsmgtnum() == null ? 0 : this.getTrsmgtnum().hashCode() );
         result = 37 * result + ( getTrsitmmgtnum() == null ? 0 : this.getTrsitmmgtnum().hashCode() );
         result = 37 * result + ( getTrsrefmgtnum() == null ? 0 : this.getTrsrefmgtnum().hashCode() );
         return result;
   }   





}