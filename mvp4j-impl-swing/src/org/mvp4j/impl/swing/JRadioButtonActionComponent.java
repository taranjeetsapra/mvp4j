package org.mvp4j.impl.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JRadioButton;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import org.apache.log4j.Logger;
import org.mvp4j.adapter.ActionBinding;
import org.mvp4j.adapter.ActionComponent;
import org.mvp4j.impl.swing.utils.LoggerUtils;

public class JRadioButtonActionComponent extends ActionComponent{

	private JRadioButton jradioButton;
	private static final Class<?> DEFAULT_EVENT_TYPE = ActionListener.class;
	private ItemListener itemListener;
	private ActionListener actionListener;
	private MouseListener mouseListener;
	private KeyListener keyListener;
	
	private ComponentListener componentListener;
	private AncestorListener ancestorListener;
	private ContainerListener containerListener;
	private FocusListener focusListener;
	private HierarchyBoundsListener hierarchyBoundsListener;
	private HierarchyListener hierarchyListener;
	private InputMethodListener inputMethodListener;
	private MouseMotionListener mouseMotionListener;
	private MouseWheelListener mouseWheelListener;
	private PopupMenuListener popupMenuListener;
	private PropertyChangeListener propertyChangeListener;
	private Logger logger = LoggerUtils.getLogger();
	private String eventAction;
	

	public JRadioButtonActionComponent() {
	}
	
	@Override
	public void bind() {
		Class<?> eventType = actionBinding.getEventType();
		eventAction=actionBinding.getEventAction();
		
		if(eventType==null){
			eventType=DEFAULT_EVENT_TYPE;
		}
		if(eventType==ActionListener.class){
	    	
	    	actionListener=new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					if(eventAction.equals("actionPerformed")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					  
				}
	    		
	    	};
	    	jradioButton.addActionListener(actionListener);
	    }
		
		else if(eventType==ItemListener.class){
			
			itemListener=new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(eventAction.equals("itemStateChanged")  || eventAction.equals("")){
					actionBinding.callAction(e);
					
					}}
				
			};
			jradioButton.addItemListener(itemListener);
		}
		else if(eventType==MouseListener.class){
	    	mouseListener=new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					if(eventAction.equals("mouseReleased")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(eventAction.equals("mousePressed")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					if(eventAction.equals("mouseExited")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					if(eventAction.equals("mouseEntered")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if(eventAction.equals("mouseClicked")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
			};
			jradioButton.addMouseListener(mouseListener);
			
	    }
	    
		else if(eventType==KeyListener.class){
		  
		  keyListener=new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if(eventAction.equals("keyTyped")  || eventAction.equals("")){
					actionBinding.callAction(e);
					
				}
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(eventAction.equals("keyReleased")  || eventAction.equals("")){
					actionBinding.callAction(e);
					
				}
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(eventAction.equals("keyPressed")  || eventAction.equals("")){
					actionBinding.callAction(e);
					
				}
				
				
			}
			
		};
		jradioButton.addKeyListener(keyListener);
		
	  }
		else if(eventType==ComponentListener.class){
			componentListener=new ComponentListener() {
				
				@Override
				public void componentShown(ComponentEvent e) {
					if(eventAction.equals("componentShown")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
				
				@Override
				public void componentResized(ComponentEvent e) {
					if(eventAction.equals("componentResized")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
				
				@Override
				public void componentMoved(ComponentEvent e) {
					if(eventAction.equals("componentMoved")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
				
				@Override
				public void componentHidden(ComponentEvent e) {
					if(eventAction.equals("componentHidden")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
			};
			jradioButton.addComponentListener(componentListener);
		}
		else if(eventType==AncestorListener.class){
			ancestorListener=new AncestorListener() {
				
				@Override
				public void ancestorRemoved(AncestorEvent e) {
					if(eventAction.equals("ancestorRemoved")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
				
				@Override
				public void ancestorMoved(AncestorEvent e) {
					if(eventAction.equals("ancestorMoved")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
				
				@Override
				public void ancestorAdded(AncestorEvent e) {
					if(eventAction.equals("ancestorAdded")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
					
				}
			};
			jradioButton.addAncestorListener(ancestorListener);
		}
		else if(eventType==ContainerListener.class){
			containerListener=new ContainerListener() {
				
				@Override
				public void componentRemoved(ContainerEvent e) {
					if(eventAction.equals("componentRemoved")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
				
				@Override
				public void componentAdded(ContainerEvent e) {
					if(eventAction.equals("componentAdded")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
			};
			jradioButton.addContainerListener(containerListener);
		}
		else if(eventType==FocusListener.class){
			focusListener=new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
					if(eventAction.equals("focusLost")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
				
				@Override
				public void focusGained(FocusEvent e) {
					if(eventAction.equals("focusGained")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
			};
			jradioButton.addFocusListener(focusListener);
		}
		else if(eventType==HierarchyBoundsListener.class){
			hierarchyBoundsListener=new HierarchyBoundsListener() {
				
				@Override
				public void ancestorResized(HierarchyEvent e) {
					if(eventAction.equals("ancestorResized")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
				
				@Override
				public void ancestorMoved(HierarchyEvent e) {
					if(eventAction.equals("ancestorMoved")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
			};
			jradioButton.addHierarchyBoundsListener(hierarchyBoundsListener);
		}
		else if(eventType==HierarchyListener.class){
			
			hierarchyListener=new HierarchyListener() {
				
				@Override
				public void hierarchyChanged(HierarchyEvent e) {
					if(eventAction.equals("hierarchyChanged")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
			};
			jradioButton.addHierarchyListener(hierarchyListener);
		}
		else if(eventType==InputMethodListener.class){
			inputMethodListener=new InputMethodListener() {
				
				@Override
				public void inputMethodTextChanged(InputMethodEvent e) {
					if(eventAction.equals("inputMethodTextChanged")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
				
				@Override
				public void caretPositionChanged(InputMethodEvent e) {
					if(eventAction.equals("caretPositionChanged")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
			};
			jradioButton.addInputMethodListener(inputMethodListener);
		}
		else if(eventType==MouseMotionListener.class){
			mouseMotionListener=new MouseMotionListener() {
				
				@Override
				public void mouseMoved(MouseEvent e) {
					if(eventAction.equals("mouseMoved")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					if(eventAction.equals("mouseDragged")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
			};
			jradioButton.addMouseMotionListener(mouseMotionListener);
		}
		else if(eventType==MouseWheelListener.class){
			
			mouseWheelListener=new MouseWheelListener() {
				
				@Override
				public void mouseWheelMoved(MouseWheelEvent e) {
					if(eventAction.equals("mouseWheelMoved")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
			};
			jradioButton.addMouseWheelListener(mouseWheelListener);
		}
	
		else if(eventType==PropertyChangeListener.class){
			
			propertyChangeListener= new PropertyChangeListener() {
				
				@Override
				public void propertyChange(PropertyChangeEvent e) {
					if(eventAction.equals("propertyChange")  || eventAction.equals("")){
						actionBinding.callAction(e);
						
					}
					
				}
			};
			jradioButton.addPropertyChangeListener(propertyChangeListener);
		}
		else
			logger.info("This event type "+eventType+" is not supported");
		
	}

	@Override
	public void unbind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(ActionBinding actionBinding) {
		super.init(actionBinding);
		jradioButton=(JRadioButton)actionBinding.getComponent();
	}

}
