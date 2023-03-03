package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtDoSkillSuccNotify {
    @Tag(tag=13) public Integer casterId = null;
    @Tag(tag=10) public Integer forwardType = null;
    @Tag(tag=15) public Vector forward = null;
    @Tag(tag=7) public Integer skillId = null;
}
