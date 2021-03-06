package baseball.view;

import baseball.domain.MatchResult;

public class OutputView {

    private static final int VIEW_COUNT = 0;
    private static final String STRIKE_MESSAGE = "%d 스트라이크 ";
    private static final String BALL_MESSAGE = "%d 볼";
    private static final String NOTHING_MESSAGE = "낫싱";

    public static void showMatchResult(final MatchResult result) {
        int strikeCount = result.getStrikeCount();
        int ballCount = result.getBallCount();

        if (strikeCount > VIEW_COUNT) {
            System.out.print(String.format(STRIKE_MESSAGE, strikeCount));
        }

        if (ballCount > VIEW_COUNT) {
            System.out.print(String.format(BALL_MESSAGE, ballCount));
        }

        if (strikeCount == VIEW_COUNT && ballCount == VIEW_COUNT) {
            System.out.print(NOTHING_MESSAGE);
        }

        System.out.println();
    }

}
