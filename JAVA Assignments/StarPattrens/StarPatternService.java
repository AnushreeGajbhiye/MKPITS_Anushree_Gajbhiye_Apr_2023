public class StarPatternService {
    public void servicePattern( String pattern,int number1){
        switch (pattern){
            case "pattern1":
                DecreasingStarPattern decreasingStarPattern = new DecreasingStarPattern();
                decreasingStarPattern.getStarPattern(number1);
                break;
            case "pattern2":
                DiamondNumericPattern diamondNumericPattern = new DiamondNumericPattern();
                diamondNumericPattern.getStarPattern(number1);
                break;
            case "pattern3":
                DiamondShapeStarPattern diamondShapeStarPattern = new DiamondShapeStarPattern();
                diamondShapeStarPattern.getStarPattern(number1);
                break;
            case"pattern4":
                ReversePyaramidStarPattern reversePyaramidStarPattern = new ReversePyaramidStarPattern();
                reversePyaramidStarPattern.getStarPattern(number1);
                break;
            case "pattern5":
                RightPascalsTriangleStarPattern rightPascalsTriangleStarPattern = new RightPascalsTriangleStarPattern();
                rightPascalsTriangleStarPattern.getStarPattern(number1);
                break;
            case "pattern6":
                SandglassStarPattern sandglassStarPattern = new SandglassStarPattern();
                sandglassStarPattern.getStarPattern(number1);
                break;
        }

    }

}
