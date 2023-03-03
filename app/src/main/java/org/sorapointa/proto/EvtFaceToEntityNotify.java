package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtFaceToEntityNotify {
    @Tag(tag=5) public Integer faceEntityId = null;
    @Tag(tag=9) public Integer forwardType = null;
    @Tag(tag=1) public Integer entityId = null;
}
