package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ContentAuditInfo.*;
import org.sorapointa.proto.ContentAuditInfo;

public class PlayerNicknameAuditDataNotify {
    @Tag(tag=13) public ContentAuditInfo info = null;
}
