package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocencePhotoFinishRsp {
    @Tag(tag=6) public Integer objectId = null;
    @Tag(tag=11) public Integer param = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
