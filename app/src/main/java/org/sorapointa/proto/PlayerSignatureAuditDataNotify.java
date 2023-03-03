package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ContentAuditInfo.*;
import org.sorapointa.proto.ContentAuditInfo;

public class PlayerSignatureAuditDataNotify {
    @Tag(tag=14) public ContentAuditInfo info = null;
}
