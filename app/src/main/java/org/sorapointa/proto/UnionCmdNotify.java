package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UnionCmd.*;
import org.sorapointa.proto.UnionCmd;

public class UnionCmdNotify {
    @Tag(tag=1) public List<UnionCmd> cmdList = new ArrayList<>();
}
