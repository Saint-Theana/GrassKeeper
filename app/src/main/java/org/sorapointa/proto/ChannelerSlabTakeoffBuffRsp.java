package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabTakeoffBuffRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Boolean isMp = null;
    @Tag(tag=14) public Integer buffId = null;
    @Tag(tag=8) public Integer slotId = null;
}
