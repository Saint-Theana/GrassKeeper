package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtBulletMoveNotify {
    @Tag(tag=14) public Integer forwardType = null;
    @Tag(tag=1) public Vector curPos = null;
    @Tag(tag=11) public Integer entityId = null;
}
