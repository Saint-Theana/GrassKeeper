package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AuditState {
        @Tag(tag=0) AuditNone ,
        @Tag(tag=1) AuditWaiting ,
        @Tag(tag=2) AuditFailed ;
}
