package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class MarkEntityInMinMapNotify {
    @Tag(tag=4) public Vector position = null;
    @Tag(tag=7) public Integer monsterId = null;
    @Tag(tag=14) public Integer entityId = null;
}
