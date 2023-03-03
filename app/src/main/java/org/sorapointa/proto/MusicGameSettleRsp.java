package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicGameSettleRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer musicBasicId = null;
    @Tag(tag=6) public Boolean isNewRecord = null;
    @Tag(tag=2) public Boolean isUnlockNextLevel = null;
    @Tag(tag=10) public Long ugcGuid = null;
}
