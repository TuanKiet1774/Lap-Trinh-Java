package bt_java.baitap_a7;

public class Computer {
    private String CPU;
    private String Ram;
    private String Screen;
    private String hardDisk;

    public Computer(Builder b) {
        this.CPU = b.CPU;
        this.Ram = b.Ram;
        this.Screen = b.Screen;
        this.hardDisk = b.hardDisk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", Ram='" + Ram + '\'' +
                ", Screen='" + Screen + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }

    public static class Builder{
        private String CPU = "Default";
        private String Ram = "Default";
        private String Screen = "Default";
        private String hardDisk = "Default";

        public Builder builderCPU(String CPU)
        {
            this.CPU = CPU;
            return this;
        }

        public Builder builderRam(String Ram)
        {
            this.Ram = Ram;
            return this;
        }

        public Builder builderScreen(String Screen)
        {
            this.Screen = Screen;
            return this;
        }

        public Builder builderhardDisk(String hardDisk)
        {
            this.hardDisk = hardDisk;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
