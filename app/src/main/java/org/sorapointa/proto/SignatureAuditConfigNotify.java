package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SignatureAuditConfigNotify {
    @Tag(tag=9) public Boolean isOpen = null;
    @Tag(tag=10) public Integer submitLimit = null;
}