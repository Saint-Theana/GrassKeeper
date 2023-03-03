package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MeetNpcRsp {
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer npcFirstMetId = null;
}
