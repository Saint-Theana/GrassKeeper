package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetParentQuestVideoKeyRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Long videoKey = null;
    @Tag(tag=10) public Integer parentQuestId = null;
}
