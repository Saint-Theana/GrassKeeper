package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class AnimatorForceSetAirMoveNotify {
    @Tag(tag=14) public Integer entityId = null;
    @Tag(tag=13) public Boolean inAirMove = null;
    @Tag(tag=9) public Integer forwardType = null;
}
