package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartFishingReq {
    @Tag(tag=5) public Integer rodEntityId = null;
    @Tag(tag=15) public Integer fishPoolId = null;
}
