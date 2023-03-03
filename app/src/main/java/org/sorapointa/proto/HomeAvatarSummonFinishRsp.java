package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarSummonFinishRsp {
    @Tag(tag=8) public Integer eventId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
