package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicGameStartRsp {
    @Tag(tag=4) public Integer musicBasicId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Long ugcGuid = null;
}
