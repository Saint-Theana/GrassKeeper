package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtBulletDeactiveNotify {
    @Tag(tag=6) public Integer forwardType = null;
    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=4) public Vector disappearPos = null;
}
