package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ContentAuditField {
    @Tag(tag=1) public List<ContentAuditData> segmentList = new ArrayList<>();
    @Tag(tag=2) public String name = null;
}
