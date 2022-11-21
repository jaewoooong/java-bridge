package bridge;

import java.util.List;

public class BridgeGame {

    List<String> bridge;
    Boolean isMovable;
    Integer bridgeIndex = -1;
    Integer tryNumber = 1;

    public BridgeGame(List<String> bridge) {
        this.bridge = bridge;
    }

    private boolean canMove(String moving) {
        return moving.equals(bridge.get(bridgeIndex));
    }

    public void move(String moving) {
        bridgeIndex++;
        if (canMove(moving)) {
            isMovable = true;
        }
        if (!canMove(moving)) {
            isMovable = false;
        }
    }

    public void retry() {
        bridgeIndex--;
        isMovable = true;
        tryNumber++;
    }

    public boolean getIsMovable() {
        return isMovable;
    }

    public int getBridgeIndex(){
        return bridgeIndex;
    }

    public String getBridgePosition() {
        return bridge.get(bridgeIndex);
    }

    public int getTryNumber() {
        return tryNumber;
    }
}
