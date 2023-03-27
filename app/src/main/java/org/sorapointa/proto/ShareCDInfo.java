package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShareCDInfo {
    @Tag(tag=13) public Integer shareCdId = null;
    @Tag(tag=1) public Long cdStartTime = null;
    @Tag(tag=11) public Integer index = null;
}
