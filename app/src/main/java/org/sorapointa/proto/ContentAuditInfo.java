package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ContentAuditInfo {
    @Tag(tag=1) public Boolean isOpen = null;
    @Tag(tag=2) public String content = null;
    @Tag(tag=3) public Integer submitCount = null;
    @Tag(tag=4) public Integer auditState = null;
    @Tag(tag=5) public Integer submitLimit = null;
}
