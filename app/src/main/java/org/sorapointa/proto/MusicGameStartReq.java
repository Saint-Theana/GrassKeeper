package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicGameStartReq {
    @Tag(tag=2) public Integer musicBasicId = null;
    @Tag(tag=11) public Boolean isSaveScore = null;
    @Tag(tag=3) public Long ugcGuid = null;
}
