package sheet3;

public class stopwatch {
    
    private long startTime;
    private long endTime;
    
    public stopwatch() {
        this.startTime = System.currentTimeMillis();
    }
    
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }
}