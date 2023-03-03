package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EvtFaceToDirInfo.*;
import org.sorapointa.proto.EvtFaceToDirInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtFaceToDirNotify {
    @Tag(tag=13) public Integer forwardType = null;
    @Tag(tag=5) public EvtFaceToDirInfo evtFaceToDirInfo = null;
}
