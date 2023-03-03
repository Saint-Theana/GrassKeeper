package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairMusicGameSettleRsp {
    @Tag(tag=4) public Boolean isUnlockNextLevel = null;
    @Tag(tag=12) public Boolean isNewRecord = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer musicBasicId = null;
}
