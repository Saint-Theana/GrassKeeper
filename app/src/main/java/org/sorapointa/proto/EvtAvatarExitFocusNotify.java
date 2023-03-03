package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtAvatarExitFocusNotify {
    @Tag(tag=12) public Vector finishForward = null;
    @Tag(tag=11) public Integer forwardType = null;
    @Tag(tag=14) public Integer entityId = null;
}
