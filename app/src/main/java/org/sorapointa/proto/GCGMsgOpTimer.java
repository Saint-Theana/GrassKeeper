package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGPhaseType.*;
import org.sorapointa.proto.GCGPhaseType;

public class GCGMsgOpTimer {
    @Tag(tag=9,isFixed=true) public Long beginTime = null;
    @Tag(tag=3) public Integer phase = null;
    @Tag(tag=13,isFixed=true) public Long timeStamp = null;
    @Tag(tag=8) public Integer controllerId = null;
}
