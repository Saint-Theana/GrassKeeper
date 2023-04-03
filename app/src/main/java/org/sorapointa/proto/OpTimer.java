package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGPhaseType.*;
import org.sorapointa.proto.GCGPhaseType;

public class OpTimer {
    @Tag(tag=9) public Long timeStamp = null;
    @Tag(tag=10) public Long beginTime = null;
    @Tag(tag=6) public Integer controllerId = null;
    @Tag(tag=1) public Integer phase = null;
}
