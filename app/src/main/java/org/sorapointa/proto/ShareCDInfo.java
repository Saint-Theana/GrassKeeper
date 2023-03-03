package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShareCDInfo {
    @Tag(tag=2) public Integer index = null;
    @Tag(tag=14) public Long cdStartTime = null;
    @Tag(tag=12) public Integer shareCdId = null;
}
