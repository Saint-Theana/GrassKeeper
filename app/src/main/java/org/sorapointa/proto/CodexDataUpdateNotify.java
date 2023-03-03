package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CodexType.*;
import org.sorapointa.proto.CodexType;

public class CodexDataUpdateNotify {
    @Tag(tag=8) public Integer id = null;
    @Tag(tag=15) public Integer weaponMaxPromoteLevel = null;
    @Tag(tag=11) public Integer type = null;
}
