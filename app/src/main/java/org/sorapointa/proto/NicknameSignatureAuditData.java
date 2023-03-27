package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NicknameSignatureAuditData {
    @Tag(tag=1) public String aid = null;
    @Tag(tag=2) public String entityId = null;
    @Tag(tag=3) public String lang = null;
    @Tag(tag=4) public String queueKey = null;
    @Tag(tag=5) public String region = null;
    @Tag(tag=6) public Integer uid = null;
    @Tag(tag=7) public List<ContentAuditField> auditFieldList = new ArrayList<>();
    @Tag(tag=8) public List<ContentAuditAuxiliaryField> auxFieldList = new ArrayList<>();
}
