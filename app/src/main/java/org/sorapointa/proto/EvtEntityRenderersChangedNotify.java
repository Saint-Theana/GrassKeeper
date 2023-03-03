package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityRendererChangedInfo.*;
import org.sorapointa.proto.EntityRendererChangedInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtEntityRenderersChangedNotify {
    @Tag(tag=8) public Integer forwardType = null;
    @Tag(tag=3) public Boolean isServerCache = null;
    @Tag(tag=5) public EntityRendererChangedInfo rendererChangedInfo = null;
    @Tag(tag=15) public Integer entityId = null;
}
