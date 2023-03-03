package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtAvatarUpdateFocusNotify {
    @Tag(tag=7) public Integer forwardType = null;
    @Tag(tag=11) public Vector focusForward = null;
    @Tag(tag=10) public Integer entityId = null;
}
