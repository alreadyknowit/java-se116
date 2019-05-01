
package Donem2;

public class Worker {
    
    private int workerID;
    private String fullName;
    private String jobDescription;
    private double monthlySalary;
    private boolean isMaster;
    
    
    void setFullName(String fullName)
    {
        this.fullName=fullName;
    }
    void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary=monthlySalary;
    }
    void setJobDescripton(String jobDescripton)
    {
       this.jobDescription=jobDescripton;
    }
    void setWorkerID(int workerID)
    {
        this.workerID=workerID;
    }
    void setMaster( boolean isMaster)
    {
        this.isMaster=isMaster;
    }
    int getWorkerID()
    {
        return workerID;
    }
    String getFullName()
    {
        return fullName;
    }
    String getJobDescripton()
    {
        return jobDescription;
    }
    double getMonthlySalary()
    {
        return monthlySalary;
    }
    boolean getMaster()
    {
        return isMaster;
    }
    public double calculateAnnualIncome()
    {
        if(isMaster)
            return 12*(6/5)*monthlySalary;
        else
        return 12*monthlySalary;
    }

   
}
