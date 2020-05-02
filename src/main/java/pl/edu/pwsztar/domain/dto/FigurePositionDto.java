package pl.edu.pwsztar.domain.dto;

public class FigurePositionDto {
    private int startXAxis;
    private int startYAxis;
    private int destinationXAxis;
    private int destinationYAxis;

    FigurePositionDto(){

    }

    public FigurePositionDto(Builder builder){
        this.startXAxis = builder.startXAxis;
        this.startYAxis = builder.startYAxis;
        this.destinationXAxis = builder.destinationXAxis;
        this.destinationYAxis = builder.destinationYAxis;
    }

    public int getStartXAxis() {
        return startXAxis;
    }

    public int getStartYAxis() {
        return startYAxis;
    }

    public int getDestinationXAxis() {
        return destinationXAxis;
    }

    public int getDestinationYAxis() {
        return destinationYAxis;
    }

    public static final class Builder{
        private int startXAxis;
        private int startYAxis;
        private int destinationXAxis;
        private int destinationYAxis;

        public Builder(){

        }

        public Builder startXAxis(int startXAxis){
            this.startXAxis = startXAxis;
            return this;
        }

        public Builder startYAxis(int startYAxis){
            this.startYAxis = startYAxis;
            return this;
        }

        public Builder destinationXAxis(int destinationXAxis){
            this.destinationXAxis = destinationXAxis;
            return this;
        }

        public Builder destinationYAxis(int destinationYAxis){
            this.destinationYAxis = destinationYAxis;
            return this;
        }

        public FigurePositionDto build(){
            return new FigurePositionDto(this);
        }
    }
}