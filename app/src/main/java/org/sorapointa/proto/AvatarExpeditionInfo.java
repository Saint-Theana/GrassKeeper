package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarExpeditionInfo {
    @Tag(tag=1) public Integer state = null;
    @Tag(tag=2) public Integer expId = null;
    @Tag(tag=3) public Integer hourTime = null;
    @Tag(tag=4) public Integer startTime = null;
    @Tag(tag=5,isFloat=true) public Float shortenRatio = null;
}
