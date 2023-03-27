package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtAvatarEnterFocusNotify {
    public enum EvtAvatarEnterFocusNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=325) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer forwardType = null;
    @Tag(tag=5) public Boolean useAutoFocus = null;
    @Tag(tag=13) public Boolean enterNormalFocusShoot = null;
    @Tag(tag=6) public Boolean disableAimLayer = null;
    @Tag(tag=10) public Boolean fastFocus = null;
    @Tag(tag=4) public Boolean useFocusSticky = null;
    @Tag(tag=12) public Boolean showCrossHair = null;
    @Tag(tag=11) public Boolean enterHoldingFocusShoot = null;
    @Tag(tag=9) public Boolean canMove = null;
    @Tag(tag=15) public Boolean useGyro = null;
    @Tag(tag=8) public Vector focusForward = null;
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=3) public Boolean disableAnim = null;
}
