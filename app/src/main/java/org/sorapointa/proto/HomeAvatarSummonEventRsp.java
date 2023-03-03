package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarSummonEventRsp {
    @Tag(tag=11) public Integer eventId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
