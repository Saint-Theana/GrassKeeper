package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairMusicGameSettleReq {
    @Tag(tag=3) public Integer score = null;
    @Tag(tag=6) public Integer combo = null;
    @Tag(tag=10) public Integer correctHit = null;
    @Tag(tag=11) public Integer musicBasicId = null;
}
