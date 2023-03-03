package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NicknameAuditConfigNotify {
    @Tag(tag=8) public Boolean isOpen = null;
    @Tag(tag=12) public Integer submitLimit = null;
}
