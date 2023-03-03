package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtAvatarEnterFocusNotify {
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=10) public Boolean canMove = null;
    @Tag(tag=13) public Boolean enterHoldingFocusShoot = null;
    @Tag(tag=6) public Boolean disableAimLayer = null;
    @Tag(tag=5) public Boolean useAutoFocus = null;
    @Tag(tag=3) public Boolean fastFocus = null;
    @Tag(tag=12) public Boolean showCrossHair = null;
    @Tag(tag=14) public Boolean enterNormalFocusShoot = null;
    @Tag(tag=8) public Integer forwardType = null;
    @Tag(tag=7) public Vector focusForward = null;
    @Tag(tag=9) public Boolean disableAnim = null;
    @Tag(tag=15) public Boolean useFocusSticky = null;
    @Tag(tag=11) public Boolean useGyro = null;
}
