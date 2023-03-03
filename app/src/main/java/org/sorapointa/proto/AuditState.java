package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AuditState {
        @Tag(tag=0) AUDIT_STATE_NONE ,
        @Tag(tag=1) AUDIT_STATE_WAITING ,
        @Tag(tag=2) AUDIT_STATE_FAILED ;
}
