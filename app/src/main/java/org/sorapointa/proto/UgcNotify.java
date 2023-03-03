package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UgcNotify {
    @Tag(tag=12) public Boolean isUgcPublishBan = null;
    @Tag(tag=8) public Boolean isUgcPublishFeatureClosed = null;
    @Tag(tag=15) public Boolean isUgcFeatureClosed = null;
}
